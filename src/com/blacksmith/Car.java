package com.blacksmith;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public String setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
            return this.model;
        }

        public String getModel() {
        return this.model;
    }
}
