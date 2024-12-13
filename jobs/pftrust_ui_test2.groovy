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
                scriptPath('Jenkinsfile') // Path to the Jenkinsfile in the app-a repository
            }
        }
    }
}