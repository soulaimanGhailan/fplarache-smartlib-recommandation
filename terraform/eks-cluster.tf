module "eks" {
  source  = "terraform-aws-modules/eks/aws"
  version = "20.29.0"

  cluster_name = "fplarache-smartlib-eks"
  cluster_version = "1.31"

  subnet_ids = module.vpc.private_subnets
  vpc_id = module.vpc.vpc_id

  tags = {
    environment = var.environment
    application = "recommendation-grpc-service"
  }

  eks_managed_node_groups = {
    dev = {
      min_size     = 1
      max_size     = 2
      desired_size = 1

      instance_types = [var.instance_type]
    }
  }

}