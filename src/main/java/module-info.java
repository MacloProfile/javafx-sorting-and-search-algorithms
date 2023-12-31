module com.mcl.typesofsorts {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.mcl.typesofsorts to javafx.fxml;
    exports com.mcl.typesofsorts;
    exports com.mcl.typesofsorts.Controllers;
    opens com.mcl.typesofsorts.Controllers to javafx.fxml;
    exports com.mcl.typesofsorts.logic;
    opens com.mcl.typesofsorts.logic to javafx.fxml;
    exports com.mcl.typesofsorts.Visualization;
    opens com.mcl.typesofsorts.Visualization to javafx.fxml;
    exports com.mcl.typesofsorts.logic.features;
    opens com.mcl.typesofsorts.logic.features to javafx.fxml;
}