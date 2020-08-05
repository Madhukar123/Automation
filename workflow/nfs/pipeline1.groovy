pipelineJob('example') {
    definition {
        cps {
            script(readFileFromWorkspace('pipeline.groovy'))
            sandbox()
        }
    }
}
