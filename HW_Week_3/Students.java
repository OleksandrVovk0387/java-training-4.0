class Students {
    private String name;
    private double rating;

    public Students() {
        name = "";
        rating = 0.0;
    }

    public Students(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean betterStudent(Students other) {
        return this.rating > other.rating;
    }

    public String toString() {
        return "Name: " + name + ", Rating: " + rating;
    }

    public void changeRating(double newRating) {
        this.rating = newRating;
    }
}