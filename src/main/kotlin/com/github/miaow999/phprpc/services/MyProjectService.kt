package com.github.miaow999.phprpc.services

import com.intellij.openapi.project.Project
import com.github.miaow999.phprpc.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
