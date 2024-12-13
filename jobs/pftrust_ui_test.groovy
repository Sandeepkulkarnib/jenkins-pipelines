pipelineJob('pftrust-ui-test') {
    description('pftrust-ui-test')
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/Sandeepkulkarnib/jenkins-pipelines.git')
                        credentials('github-access') // GitHub credentials
                    }
                    branches('main')
                }
                scriptPath('pipelines/pftrust_ui_test/Jenkinsfile') // Path to the Jenkinsfile in the app-a repository
            }
        }
    }
}