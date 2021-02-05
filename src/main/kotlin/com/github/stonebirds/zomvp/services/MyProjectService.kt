package com.github.stonebirds.zomvp.services

import com.github.stonebirds.zomvp.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
