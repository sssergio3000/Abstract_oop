package temperatureConverter;

public class ConvertToKelvin extends ConverterTemperature{
    @Override
    double convert(double celcius) {
        return celcius+273.15;

    }
}
