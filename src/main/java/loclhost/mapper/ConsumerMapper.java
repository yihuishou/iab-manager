package loclhost.mapper;

import loclhost.model.Consumer;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface ConsumerMapper extends Mapper<Consumer> {

    @Select("select * from Consumer where roleid = #{role}")
    List<Consumer> findConsumerByRole(String role);

}