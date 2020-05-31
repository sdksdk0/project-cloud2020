package cn.tf.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    /**
     * 订单id
     *
     */
    private Long id;
    //
    /**
     *  流水号
     */
    private String serial;


}
