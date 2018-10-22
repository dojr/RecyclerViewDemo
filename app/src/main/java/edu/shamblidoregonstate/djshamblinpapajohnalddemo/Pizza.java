package edu.shamblidoregonstate.djshamblinpapajohnalddemo;

public class Pizza {
    private String mTopping;
    private String mDescription;

    public Pizza(String topping, String description) {
        mTopping = topping;
        mDescription = description;
    }

    public String getTopping() {
        return mTopping;
    }

    public void setTopping(String topping) {
        mTopping = topping;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
