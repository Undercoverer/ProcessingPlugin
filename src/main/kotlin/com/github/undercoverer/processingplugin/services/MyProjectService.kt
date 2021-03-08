package com.github.undercoverer.processingplugin.services

import com.github.undercoverer.processingplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
