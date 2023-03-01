public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    // public void dive() {
    // if (!this.swimming && this.depths == 0) {
    // this.swimming = true;
    // System.out.printf("%s dives into the water.%n", this.getName());
    // }
    // }
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println( this.getName()+" takes off in the sky.");
        }
    }

    
    
    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.println(this.getName() + " flies upward, altitude : " + this.altitude);
        }
        return this.altitude;

    }

    @Override
    public void glide() {

        System.out.println("It glides into the air.");

    }
// @Override
    // public int swimDown(int meters) {
    // if (this.swimming) {
    // this.depths = Math.min(this.depths + meters, 325);
    // System.out.printf("%s swims downward, depths : %d%n", this.getName(),
    // this.depths);
    // }
    // return this.depths;
    // }
    @Override
    public int descend(int meters) {
        if (this.flying){
            this.altitude = Math.min(this.altitude -  meters, 325);
            System.out.println(this.getName()+" flies downward, altitude : "+ this.altitude );
        }
        return this.altitude;
    }
    // @Override
    // public void getOut() {
    //     if (this.swimming && this.depths == 0) {
    //         System.out.printf("%s gets out of the water.%n", this.getName());
    //     } else {
    //         System.out.printf("%s is too deep, it can't get out.%n", this.getName());
    //     }
    // }
    @Override
    public void land() {
        if(this.flying && this.altitude <=1){
            System.out.println(this.getName()+" lands on the ground.");
        }else{
            System.out.println(this.getName()+ " is to hight for landing");
        }
        
    }

}
