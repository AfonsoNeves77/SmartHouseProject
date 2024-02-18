package pt.ipp.isep.dei.project.controller;
import pt.ipp.isep.dei.project.DTO.DeviceDTO;
import pt.ipp.isep.dei.project.DTO.DeviceDTOMapper;
import pt.ipp.isep.dei.project.DTO.RoomDTO;
import pt.ipp.isep.dei.project.DTO.RoomDTOMapper;
import pt.ipp.isep.dei.project.domain.*;



public class AddSensorToDeviceCTRL {

    private House house;

    /**
     * Constructs a GetListOfRoomsCTRL object with the provided House instance.
     *
     * @param house The House instance to be associated with the controller.
     */

    public AddSensorToDeviceCTRL(House house){
        this.house = house;
    }


    /**
     * The overall goal of this method is adding a sensor to the specified device within the given room.
     *
     * @param roomDTO The data transfer object representing the room.
     * @param deviceDto The data transfer object representing the device.
     * @param nameSensor The name of the sensor to be added.
     * @param sensorType The type of the sensor to be added.
     * @return (0) - sensor was added with success,
     *         (1) - sensor not added, invalid parameters,
     *         (2) - sensor not added, passed sensor name is duplicated,
     *         (3) - No match between received RoomDTO object and homologue Room object in domain/No match between received
     *          DeviceDTO object and homologue Device object in domain.
     * @see RoomDTO
     * @see DeviceDTO
     * @see Room
     * @see Device
     * @see ListOfSensors
     */

    public int addSensorToDevice(RoomDTO roomDTO,DeviceDTO deviceDto, String nameSensor, SensorTypeOptions sensorType){
        Room selectedRoom = getRoomFromDto(roomDTO);
        if (selectedRoom == null){
            return 3;
        }
        Device selectedDevice = getDeviceFromDto(selectedRoom,deviceDto);
        if (selectedDevice == null){
            return 3;
        }
        return selectedDevice.getListOfSensors().addSensor(nameSensor,sensorType);
    }

    /**
     * Converts a RoomDTO to a Room object using the provided mapper.
     *
     * @param roomDTO The data transfer object representing the room.
     * @return The corresponding Room object.
     */

    private Room getRoomFromDto(RoomDTO roomDTO){
        RoomDTOMapper mapper = new RoomDTOMapper();
        return mapper.dtoToDomain(roomDTO, this.house);
    }

    /**
     * Converts a DeviceDTO to a Device object within the given room using the provided mapper.
     *
     * @param room       The Room object to which the device belongs.
     * @param deviceDTO  The data transfer object representing the device.
     * @return           The corresponding Device object.
     */

    private Device getDeviceFromDto(Room room,DeviceDTO deviceDTO){
        DeviceDTOMapper deviceMapper = new DeviceDTOMapper();
        return deviceMapper.dtoToDomain(room,deviceDTO);
    }

}
