pipelineJob('pftrust-ui-test3') {
    description('pftrust-ui-test3')
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/Sandeepkulkarnib/jenkins-pipelines.git')
                        credentials('${GITHUB_TOKEN}') // GitHub credentials
                    }
                    branches('main')
                }
                scriptPath('pipelines/pftrust_ui_test3/Jenkinsfile') // Path to the Jenkinsfile in the app-a repository
            }
        }
    }
}