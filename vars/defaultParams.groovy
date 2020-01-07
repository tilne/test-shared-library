def call() {
  return [
    KEY_NAME: "cfncluster-jenkins-kitchen",
    KEY_PATH: "/var/jenkins_home/.ssh/id_rsa",
    GIT: [
      PCLUSTER: [
        REPO: "https://github.com/aws/aws-parallelcluster",
        BRANCH: "develop",
      ],
      COOKBOOK: [
        REPO: "https://github.com/aws/aws-parallelcluster-cookbook",
        BRANCH: "develop",
      ],
      NODE: [
        REPO: "https://github.com/aws/aws-parallelcluster-node",
        BRANCH: "develop",
      ],
    ],
    TEMPLATE_LIST: [
      "aws-parallelcluster",
      "batch-substack",
      "ebs-substack",
      "raid-substack",
      "efs-substack",
      "fsx-substack",
      "cw-logs-substack"
    ],
    SCHEDULERS: ["sge", "slurm", "torque", "awsbatch"],
    COMMERCIAL: [
      OSS: ["ubuntu1604", "ubuntu1804", "centos6", "centos7", "alinux"],
      INSTANCES: ["c4.xlarge", "c5.xlarge", "c5n.18xlarge", "g3.8xlarge"],
      REGIONS: [
        "us-east-1",
        "us-east-2",
        "us-west-1",
        "us-west-2",
        "ca-central-1",
        "eu-central-1",
        "eu-west-1",
        "eu-west-2",
        "eu-west-3",
        "sa-east-1",
        "ap-east-1",
        "ap-northeast-1",
        "ap-northeast-2",
        "ap-south-1",
        "ap-southeast-1",
        "ap-southeast-2",
        "eu-north-1"
      ],
      OPTIN_ACCOUNTS: ["347855709077/ap-east-1"],
    ],
    CHINA: [
      OSS: ["ubuntu1604", "ubuntu1804", "alinux"],
      INSTANCES: ["c4.xlarge"],
      REGIONS: ["cn-north-1", "cn-northwest-1"],
      OPTIN_ACCOUNTS: [],
    ],
    GOVCLOUD: [
      OSS: ["ubuntu1604", "ubuntu1804", "alinux"],
      INSTANCES: ["c5.xlarge"],
      REGIONS: ["us-gov-west-1", "us-gov-east-1"]
      OPTIN_ACCOUNTS: []
    ]
  ]
}
