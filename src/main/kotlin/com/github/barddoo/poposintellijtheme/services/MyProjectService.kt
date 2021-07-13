package com.github.barddoo.poposintellijtheme.services

import com.github.barddoo.poposintellijtheme.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
