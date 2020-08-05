100.times {
  job('example'+ it) {} 
}

pipelineJob('DSL_Demo') {

    def repo = 'https://github.com/Madhukar123/Automation.git'
   
    triggers {
        scm('*/15 * * * *')
    }
    
    definition {
        cpsScm {
          scm {
            git(repo, 'master', { node -> node / 'extensions' << '' } )
            }
        }
    }
}
