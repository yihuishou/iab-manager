package loclhost.mapper;

import loclhost.model.Roles;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface RolesMapper extends Mapper<Roles> {
}