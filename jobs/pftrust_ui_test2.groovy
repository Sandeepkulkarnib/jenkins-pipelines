pipelineJob('pftrust-ui-test2') {
    description('pftrust-ui-test2')
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/Sandeepkulkarnib/pftrust-ui.git')
                        credentials('github-access') // GitHub credentials
                    }
                    branches('main')
                }
                scriptPath('pipelines/pftrust_ui_test2/Jenkinsfile') // Path to the Jenkinsfile in the app-a repository
            }
        }
    }
}