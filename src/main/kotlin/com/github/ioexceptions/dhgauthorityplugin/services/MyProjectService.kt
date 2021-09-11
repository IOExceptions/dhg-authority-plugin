package com.github.ioexceptions.dhgauthorityplugin.services

import com.intellij.openapi.project.Project
import com.github.ioexceptions.dhgauthorityplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
