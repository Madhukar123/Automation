job('DSL-Tutorial-1-Test') {
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        sh 'first project'
    }
}
