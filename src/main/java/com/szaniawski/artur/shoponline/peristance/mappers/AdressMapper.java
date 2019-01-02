package com.szaniawski.artur.shoponline.peristance.mappers;

import com.szaniawski.artur.shoponline.domain.embeded.AdressData;
import com.szaniawski.artur.shoponline.domain.types.AdressDataTO;

public class AdressMapper {
    /**
     * This is the method which map adress entity to adress TO.
     *
     * @param AdressData
     *            as adress.
     *
     * @return AdressDataTO Entity.
     */
    public static AdressDataTO toAdressDataTO(AdressData adressDataEntity) {
        if (adressDataEntity == null)
            return null;

        return new AdressDataTO.AdressDataTOBuilder().withStreet(adressDataEntity.getStreet())
                .withNumber(adressDataEntity.getNumber()).withCity(adressDataEntity.getCity())
                .withPostCode(adressDataEntity.getPostCode()).build();

    }

    /**
     * This is the method which map adress TO to adress entity.
     *
     * @param AdressDataTO
     *            as adress.
     *
     * @return AdressData Entity.
     */
    public static AdressData toAdressDataEntity(AdressDataTO adressDataTO) {
        if (adressDataTO == null)
            return null;

        return new AdressData.AdressDataEntityBuilder().withStreet(adressDataTO.getStreet()).withNumber(adressDataTO.getNumber())
                .withCity(adressDataTO.getCity()).withPostCode(adressDataTO.getPostCode()).build();

    }

}