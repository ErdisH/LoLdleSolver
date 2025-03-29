public class Champion {
    private String name;
    private String gender;
    private String position;
    private String species;
    private String resource;
    private String rangeType;
    private String Region;
    private int releaseYear;


    public Champion(String name, String gender, String position, String species, String resource, String rangeType,
                    String region, int releaseYear) {
        this.name = name;
        this.gender = gender;
        this.position = position;
        this.species = species;
        this.resource = resource;
        this.rangeType = rangeType;
        Region = region;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getRangeType() {
        return rangeType;
    }

    public void setRangeType(String rangeType) {
        this.rangeType = rangeType;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Champion{" +
                "name='" + name + '\'' +
                "gender='" + gender + '\'' +
                ", position='" + position + '\'' +
                ", species='" + species + '\'' +
                ", resource='" + resource + '\'' +
                ", rangeType='" + rangeType + '\'' +
                ", Region='" + Region + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
