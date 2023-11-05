package org.fffd.l23o6.mapper;

import javax.annotation.processing.Generated;
import org.fffd.l23o6.pojo.entity.OrderEntity;
import org.fffd.l23o6.pojo.enum_.OrderStatus;
import org.fffd.l23o6.pojo.vo.order.OrderVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-03T00:12:55+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderVO toOrderVO(OrderEntity entity) {
        if ( entity == null ) {
            return null;
        }

        OrderVO.OrderVOBuilder orderVO = OrderVO.builder();

        orderVO.status( entityStatusText( entity ) );
        orderVO.startStationId( entity.getDepartureStationId() );
        orderVO.endStationId( entity.getArrivalStationId() );
        orderVO.price( entity.getPrice() );
        orderVO.id( entity.getId() );
        orderVO.trainId( entity.getTrainId() );
        orderVO.createdAt( entity.getCreatedAt() );
        orderVO.seat( entity.getSeat() );

        return orderVO.build();
    }

    private String entityStatusText(OrderEntity orderEntity) {
        if ( orderEntity == null ) {
            return null;
        }
        OrderStatus status = orderEntity.getStatus();
        if ( status == null ) {
            return null;
        }
        String text = status.getText();
        if ( text == null ) {
            return null;
        }
        return text;
    }
}
