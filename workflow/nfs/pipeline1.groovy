pipelineJob('DSL_Demo') {

      parameters {
        booleanParam('FLAG', true)
        choiceParam('OPTION', ['option 1 (default)', 'option 2', 'option 3'])
    }
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
pipelineJob('DSL_Demo1') {

      parameters {
        booleanParam('FLAG', true)
        choiceParam('OPTION', ['option 1 (default)', 'option 2', 'option 3'])
    }
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

