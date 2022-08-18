package DorySystem.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

public class C3P0DateSourceFactory extends UnpooledDataSourceFactory {

    public C3P0DateSourceFactory() {
        this.dataSource = new ComboPooledDataSource();
    }
}
