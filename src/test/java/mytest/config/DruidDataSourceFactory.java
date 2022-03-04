package mytest.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.DataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @Author :xiaozou
 * @Date : 2022/3/3- 18:16
 **/
public class DruidDataSourceFactory implements DataSourceFactory {

  private Properties properties;


  @Override
  public void setProperties(Properties props) {
    this.properties = props;
  }

  /**
   * 设置数据源为Druid
   * @return
   */
  @Override
  public DataSource getDataSource() {
    DruidDataSource druidDataSource = new DruidDataSource();
    druidDataSource.setConnectProperties(this.properties);
    return druidDataSource;
  }
}
