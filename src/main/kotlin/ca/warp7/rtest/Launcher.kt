package ca.warp7.rtest

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.Stage
import org.kordamp.ikonli.javafx.FontIcon

class Launcher: Application(){
    override fun start(primaryStage: Stage) {
        primaryStage.scene = Scene(VBox().apply { children.add(FontIcon("fas-times")) })
        primaryStage.show()
    }
}