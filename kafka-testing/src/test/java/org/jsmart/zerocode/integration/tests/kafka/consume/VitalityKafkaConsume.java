package org.jsmart.zerocode.integration.tests.kafka.consume;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("kafka_servers/kafka_vitatest_server.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class VitalityKafkaConsume {
    @Test
    @Scenario("kafka/consume/vitatest_kafka_consume_avro_msg_json.json")
    public void vitaTestAvroConsume_MemberInfo() throws  Exception{

    }
}
