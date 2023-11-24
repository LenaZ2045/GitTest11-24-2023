package com.telran.org.lesson2;

public class WildCat extends Cat{ // priobreli vse svoistva classa Cat ynasledovanie ispolzya kluchevoe slovo extends
    private String specification;

    @Override
    public void voice() {
        super.voice(); // ostavlyaem to chto est no mojno i zakomentirovat ili ydalit esli nado pomenyat
        System.out.println("Roars!!!"); // i dobavili esche emy svoistvo
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public WildCat(int age, String specification) {
        super(age);
        this.specification = specification;
    }
}
