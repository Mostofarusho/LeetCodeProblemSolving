public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        // throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRatePerHour() method");
        int carProducedPerHour=221;
        if(speed<0 || speed>10){
            return 0.0;
        }
        else if(speed>0 && speed<=4){
            return speed*carProducedPerHour;
        }
        else if(speed>=5 && speed<=8){
            return speed*carProducedPerHour*.9;
        }
        else if(speed==9){
            return speed*carProducedPerHour*.8;
        }
        else{
            return speed*carProducedPerHour*.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        // throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
        int carProducedPerHour=221;
        if(speed<0 || speed>10){
            return 0;
        }
        else if(speed>0 && speed<=4){
            return  (int)(speed*carProducedPerHour)/60;
        }
        else if(speed>=5 && speed<=8){
            return  (int)(speed*carProducedPerHour*.9)/60;
        }
        else if(speed==9){
            return (int)(speed*carProducedPerHour*.8)/60;
        }
        else{
            return  (int)(speed*carProducedPerHour*.77)/60;
        }

    }
   
}
