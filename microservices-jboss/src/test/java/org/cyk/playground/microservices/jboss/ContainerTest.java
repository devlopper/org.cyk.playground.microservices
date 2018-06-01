package org.cyk.playground.microservices.jboss;

import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wildfly.swarm.arquillian.DefaultDeployment;
import org.wildfly.swarm.spi.api.JARArchive;

@RunWith(Arquillian.class)
@DefaultDeployment(type = DefaultDeployment.Type.JAR)
public class ContainerTest {

	//@Deployment
	public static org.jboss.shrinkwrap.api.Archive<?> getArchive() throws Exception{
		JARArchive archive = ShrinkWrap.create( JARArchive.class );
	    //deployment.addResource( MyResource.class );
		System.out.println("ContainerTest.getArchive()");
	    return archive;
	}
	
	@Test
	public void createDataSource(){
		
	}
	
}
