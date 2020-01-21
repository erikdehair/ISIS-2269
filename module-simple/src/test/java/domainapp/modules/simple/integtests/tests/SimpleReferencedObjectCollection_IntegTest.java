package domainapp.modules.simple.integtests.tests;

import domainapp.modules.simple.dom.impl.SimpleObject;
import domainapp.modules.simple.fixture.SimpleObject_persona;
import domainapp.modules.simple.integtests.SimpleModuleIntegTestAbstract;
import org.apache.isis.applib.services.wrapper.WrapperFactory;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

/**
 * Created by E. de Hair <e.dehair@pocos.nl> on 1/21/20.
 */
public class SimpleReferencedObjectCollection_IntegTest extends SimpleModuleIntegTestAbstract {

    SimpleObject simpleObject;

    @Before
    public void setUp() {
        // given
        simpleObject = fixtureScripts.runBuilderScript(SimpleObject_persona.FOO.builder());
    }

    @Test
    public void testCollectionOfReferencedSimpleObjects() {
        wrapperFactory.wrap(simpleObject).getReferencedObjects();
    }

    @Inject
    private WrapperFactory wrapperFactory;
}
