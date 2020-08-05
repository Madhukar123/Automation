pipelineJob('DSL_Demo') {

  def repo = 'https://github.com/Madhukar123/Automation.git' 
  def sshRepo = 'git@github.com:Madhukar123/Automation.git' 
  triggers {
        scm('*/15 * * * *')
    }
    
    definition {
        cpsScm {
          scm {
            git {
              remote { url(repo) }
              branches('master', '**/feature*')
              scriptPath('misc/Jenkinsfile.v2')
              extensions { }  // required as otherwise it may try to tag the repo, which you may not want
            }
            }
        }
    }
}
