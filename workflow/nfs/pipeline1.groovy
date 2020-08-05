pipelineJob('Your App Pipeline') {

  def repo = 'https://github.com/Madhukar123/Automation.git' 
  def sshRepo = 'git@github.com:Madhukar123/Automation.git' 

  description("Your App Pipeline") 
  keepDependencies(false) 

  properties{ 

    githubProjectUrl (repo) 
    rebuild { 
      autoRebuild(false) 
    } 
  } 

  definition { 

    cpsScm { 
      scm { 
        git { 
          remote { url(sshRepo) } 
          branches('master') 
          scriptPath('pipeline.groovy') 
          extensions { }  // required as otherwise it may try to tag the repo, which you may not want 
        } 
      } 
    } 
  }
}
