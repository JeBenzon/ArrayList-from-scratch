public class memberPlayer {
    String name;
    String lastname;
    int age;
    int team;

    public memberPlayer(String name, String lastname, int age, int team) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.team = team;
    }

    public memberPlayer() {
    }


    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public int getTeam() {
        return team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "memberPlayer{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", team=" + team +
                '}';
    }
}
