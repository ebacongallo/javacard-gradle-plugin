package fr.bmartel.javacard

import fr.bmartel.javacard.common.CommonTest
import org.gradle.api.Task
import org.gradle.api.tasks.JavaExec
import org.junit.Test

import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertTrue
import static org.junit.Assert.assertTrue
import static org.junit.Assert.assertTrue
import static org.junit.Assert.assertTrue
import static org.junit.Assert.assertTrue
import static org.junit.Assert.assertTrue

class JavaCardInstallTaskTest extends CommonTest {

    @Test
    void validBuildInstall() {
        runBuildTask(StaticConfig.VALID_CONFIG)
        JavaExec installTask = project.getTasks().getByName("installJavaCard")
        assertTrue(installTask ? true : false)
        assertTrue(installTask instanceof JavaExec)
        assertEquals(installTask.group, 'global platform')
        assertEquals(installTask.args, ['-relax',
                                        '--delete', '010203040506070809',
                                        '--install', project.buildDir.absolutePath + File.separator + "javacard" + File.separator + "applet.cap"
        ])
        assertEquals(installTask.main, 'pro.javacard.gp.GPTool')
        //installTask.exec()
    }
}