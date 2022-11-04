package com.vkpapps;

import com.vkpapps.app.AppComponent;
import com.vkpapps.app.DaggerAppComponent;
import com.vkpapps.cars.Car;
import com.vkpapps.cars.VehicleComponent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFPictureData;

public class Main {
    public static void main(String[] args) throws IOException {
        AppComponent appComponent = DaggerAppComponent.factory().create();
        VehicleComponent vehicleComponent1 = appComponent.getFactory().create();
        Car car = vehicleComponent1.buildCar();
        Car car2 = vehicleComponent1.buildCar();
        VehicleComponent vehicleComponent2 = appComponent.getFactory().create();
        Car car1 = vehicleComponent2.buildCar();
        car1.getEngine().start();
    }

    public void getImage(XMLSlideShow slideShow){
        List<XSLFPictureData> pictures = slideShow.getPictureData();
        File parent = new File("images");
        if (!parent.exists())parent.mkdir();
        pictures.forEach(pictureData->{
            try{
                String name = pictureData.getFileName();
                FileOutputStream outputStream = new FileOutputStream(new File(parent,name));
                outputStream.write(pictureData.getData());
                outputStream.flush();
                outputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }
}