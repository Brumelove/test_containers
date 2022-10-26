package com.test.app.entity.idgenerator;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.hibernate.internal.util.config.ConfigurationHelper;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.LongType;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Properties;

/**
 * @author Brume
 **/
public class CustomSequenceIdGenerator extends SequenceStyleGenerator {
    public static final String VALUE_PREFIX_PARAMETER = "ROCAPP";
    public static final String VALUE_PREFIX_DEFAULT = "ROCAPP";
    public static final String NUMBER_FORMAT_PARAMETER = "%05d";
    public static final String NUMBER_FORMAT_DEFAULT = "%05d";
    public static final String DATE_FORMAT_PARAMETER = "dateFormat";
    public static final String DATE_FORMAT_DEFAULT = "%tY-%tm-%td";
    private String valuePrefix;
    private String numberFormat;
    private String format;

    @Override
    public Serializable generate(SharedSessionContractImplementor session,
                                 Object object) throws HibernateException {
        return format + valuePrefix + String.format(numberFormat, LocalDate.now(), super.generate(session, object));
    }

    @Override
    public void configure(Type type, Properties params,
                          ServiceRegistry serviceRegistry) throws MappingException {
        super.configure(LongType.INSTANCE, params, serviceRegistry);
        valuePrefix = ConfigurationHelper.getString(VALUE_PREFIX_PARAMETER,
                params, VALUE_PREFIX_DEFAULT);
        numberFormat = ConfigurationHelper.getString(NUMBER_FORMAT_PARAMETER,
                params, NUMBER_FORMAT_DEFAULT);

        format =  ConfigurationHelper.getString(DATE_FORMAT_PARAMETER, params, DATE_FORMAT_DEFAULT).replace("-", "");
    }
}
