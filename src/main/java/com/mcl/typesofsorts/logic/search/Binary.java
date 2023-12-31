package com.mcl.typesofsorts.logic.search;

import com.mcl.typesofsorts.Visualization.ViewSearch;
import com.mcl.typesofsorts.logic.features.Timer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Binary extends ViewSearch {

    //search the input number
    public static String binarySearch(int[] array, int target) {
        Timer.timeStart();
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] == target) {
                Timer.timeEnd();
                return String.valueOf(middle);
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        Timer.timeEnd();
        return "element not found";
    }

    //visualization
    @Override
    public void start() {
        Timeline timeline = BinarySearchView(array);
        timeline.setCycleCount(1);
        timeline.play();
        super.start();
    }

    private Timeline BinarySearchView(int[] array) {
        Timeline timeline = new Timeline();
        for (int i = 0; i < 4; i++) {
            int finalI = i;
            KeyFrame keyFrame = new KeyFrame(Duration.millis(speedChart * i + 1000), event -> {
                if (finalI == 0) {
                    for (int j = 0; j < 5; j++) {
                        rectangles[j].setFill(Color.RED);
                    }
                } else if (finalI == 1) {
                    for (int j = 5; j < 8; j++) {
                        rectangles[j].setFill(Color.RED);
                    }
                } else if (finalI == 2) {
                    rectangles[9].setFill(Color.RED);
                } else {
                    rectangles[8].setFill(Color.GREEN);
                }
            });
            timeline.getKeyFrames().add(keyFrame);
        }
        return timeline;
    }
}