import pandas as pd
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.metrics.pairwise import cosine_similarity

# Step 1: Load the data
books_df = pd.read_csv('extended_popular_books_example (2).csv')

# Step 2: Print the column names to check for any discrepancies
print("Columns in the CSV:", books_df.columns)

# Step 3: Ensure that the required columns are in the DataFrame
required_columns = ['genre', 'auteur', 'description']  # Using 'auteur' instead of 'author'
missing_columns = [col for col in required_columns if col not in books_df.columns]

if missing_columns:
    raise ValueError(f"Missing columns: {', '.join(missing_columns)}")
else:
    # Step 4: Combine the relevant features (e.g., genre, auteur, description) into a single feature for vectorization
    books_df['combined_features'] = books_df['genre'] + ' ' + books_df['auteur'] + ' ' + books_df['description']

    # Step 5: Apply TF-IDF Vectorization to the combined features
    tfidf_vectorizer = TfidfVectorizer(stop_words='english')
    tfidf_matrix = tfidf_vectorizer.fit_transform(books_df['combined_features'])

    # Step 6: Compute the Cosine Similarity matrix
    cosine_sim = cosine_similarity(tfidf_matrix, tfidf_matrix)

    # Step 7: Define a function to get recommendations based on cosine similarity
    def get_recommendations(title, cosine_sim=cosine_sim):
        # Get the index of the book that matches the title
        try:
            idx = books_df[books_df['titre'] == title].index[0]
        except IndexError:
            print(f"Book with title '{title}' not found.")
            return None
       
        # Get the pairwise similarity scores of all books with that book
        sim_scores = list(enumerate(cosine_sim[idx]))
       
        # Sort the books based on the similarity scores
        sim_scores = sorted(sim_scores, key=lambda x: x[1], reverse=True)
       
        # Get the indices of the top 10 most similar books (excluding itself)
        sim_scores = sim_scores[1:11]
        book_indices = [i[0] for i in sim_scores]
       
        # Return the top 10 most similar books
        return books_df[['titre', 'auteur', 'genre']].iloc[book_indices]

    # Prompt the user to enter a book title
    user_input_title = input("Enter the title of the book you want recommendations for: ")

    # Get recommendations based on the user's input
    recommendations = get_recommendations(user_input_title)
    if recommendations is not None:
        print(recommendations)
