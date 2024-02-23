package net.devmart.skywarsreloaded.api.wrapper;

public interface ParticleEffect {

    String getType();

    void setType(String type);

    double getOffsetX();

    void setOffsetX(double offsetX);

    double getOffsetY();

    void setOffsetY(double offsetY);

    double getOffsetZ();

    void setOffsetZ(double offsetZ);

    int getCount();

    void setCount(int count);

    float getData();

    void setData(float data);

}
