pipelineJob('DSL_Demo') {

  def repo = 'https://github.com/Madhukar123/Automation.git' 
  def sshRepo = 'git@github.com:Madhukar123/Automation.git' 
    
    definition {
        cpsScm {
          scm {
            git {
              remote { url(repo) }
              branches('master', '**/feature*')
              scriptPath('workflow/nfs/pipeline.groovy')
              extensions { }  // required as otherwise it may try to tag the repo, which you may not want
            }
            }
        }
    }
}
