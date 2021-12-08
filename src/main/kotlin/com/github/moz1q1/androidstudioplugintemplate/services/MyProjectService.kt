package com.github.moz1q1.androidstudioplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.moz1q1.androidstudioplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
