@REM D:\workspaces\dummyTest\.metadata\.plugins\org.eclipse.wst.server.core\tmp1\quickServerStart.bat
@REM Generated: Mon Nov 26 16:12:42 COT 2018

@setlocal
@echo off

@REM Bootstrap values ...
cd C:\Program Files (x86)\IBM\WebSphere\AppServer\profiles\AppSrv02\bin
call "C:\Program Files (x86)\IBM\WebSphere\AppServer\profiles\AppSrv02\bin\setupCmdLine.bat"
@REM For debugging the server process:
@REM set DEBUG=-Djava.compiler=NONE -Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=7777

@REM Environment Settings
SET PATH=%WAS_PATH%


@REM Launch Command
"C:\Program Files (x86)\IBM\WebSphere\AppServer/java/bin/java"  %DEBUG% "-Declipse.security" "-Dosgi.install.area=C:\Program Files (x86)\IBM\WebSphere\AppServer" "-Dosgi.configuration.area=C:\Program Files (x86)\IBM\WebSphere\AppServer\profiles\AppSrv02/servers/server1/configuration" "-Dosgi.framework.extensions=com.ibm.cds,com.ibm.ws.eclipse.adaptors" "-Xshareclasses:name=webspherev85_1.6_64,nonFatal" "-Dsun.reflect.inflationThreshold=250" "-Dwas.debug.mode=true" "-Dcom.ibm.ws.classloader.j9enabled=true" "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=7778" "-Xbootclasspath/p:C:\Program Files (x86)\IBM\WebSphere\AppServer/lib/dertrjrt.jar;C:\Program Files (x86)\IBM\WebSphere\AppServer/java/jre/lib/ibmorb.jar" "-classpath" "C:\Program Files (x86)\IBM\WebSphere\AppServer\profiles\AppSrv02/properties;C:\Program Files (x86)\IBM\WebSphere\AppServer/properties;C:\Program Files (x86)\IBM\WebSphere\AppServer/lib/startup.jar;C:\Program Files (x86)\IBM\WebSphere\AppServer/lib/bootstrap.jar;C:\Program Files (x86)\IBM\WebSphere\AppServer/lib/jsf-nls.jar;C:\Program Files (x86)\IBM\WebSphere\AppServer/lib/lmproxy.jar;C:\Program Files (x86)\IBM\WebSphere\AppServer/lib/urlprotocols.jar;C:\Program Files (x86)\IBM\WebSphere\AppServer/deploytool/itp/batchboot.jar;C:\Program Files (x86)\IBM\WebSphere\AppServer/deploytool/itp/batch2.jar;C:\Program Files (x86)\IBM\WebSphere\AppServer/java/lib/tools.jar" "-Dibm.websphere.internalClassAccessMode=allow" "-Xms50m" "-Xmx512m" "-Xcompressedrefs" "-Xscmaxaot4M" "-Xscmx60M" "-Xquickstart" "-Dws.ext.dirs=C:\Program Files (x86)\IBM\WebSphere\AppServer/java/lib;C:\Program Files (x86)\IBM\WebSphere\AppServer\profiles\AppSrv02/classes;C:\Program Files (x86)\IBM\WebSphere\AppServer/classes;C:\Program Files (x86)\IBM\WebSphere\AppServer/lib;C:\Program Files (x86)\IBM\WebSphere\AppServer/installedChannels;C:\Program Files (x86)\IBM\WebSphere\AppServer/lib/ext;C:\Program Files (x86)\IBM\WebSphere\AppServer/web/help;C:\Program Files (x86)\IBM\WebSphere\AppServer/deploytool/itp/plugins/com.ibm.etools.ejbdeploy/runtime" "-Dderby.system.home=C:\Program Files (x86)\IBM\WebSphere\AppServer/derby" "-Dcom.ibm.itp.location=C:\Program Files (x86)\IBM\WebSphere\AppServer/bin" "-Djava.util.logging.configureByServer=true" "-Duser.install.root=C:\Program Files (x86)\IBM\WebSphere\AppServer\profiles\AppSrv02" "-Djava.ext.dirs=C:\Program Files (x86)\IBM\WebSphere\AppServer/tivoli/tam;C:\Program Files (x86)\IBM\WebSphere\AppServer/java/jre/lib/ext" "-Djavax.management.builder.initial=com.ibm.ws.management.PlatformMBeanServerBuilder" "-Dpython.cachedir=C:\Program Files (x86)\IBM\WebSphere\AppServer\profiles\AppSrv02/temp/cachedir" "-Dwas.install.root=C:\Program Files (x86)\IBM\WebSphere\AppServer" "-Djava.util.logging.manager=com.ibm.ws.bootstrap.WsLogManager" "-Dserver.root=C:\Program Files (x86)\IBM\WebSphere\AppServer\profiles\AppSrv02" "-Dcom.ibm.security.jgss.debug=off" "-Dcom.ibm.security.krb5.Krb5Debug=off" "-Dcom.ibm.ws.management.event.pull_notification_timeout=120000" "-Dcom.ibm.xml.xlxp.jaxb.opti.level=3" "-Djava.library.path=C:\Program Files (x86)\IBM\WebSphere\AppServer/lib/native/win/x86_64/;C:\Program Files (x86)\IBM\WebSphere\AppServer\java\jre\bin\compressedrefs;C:\Program Files (x86)\IBM\WebSphere\AppServer\java\jre\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files (x86)\IBM\WebSphere\AppServer\lib\native\win\x86_64;C:\Program Files (x86)\IBM\WebSphere\AppServer\bin;C:\Program Files (x86)\IBM\WebSphere\AppServer\java\bin;C:\Program Files (x86)\IBM\WebSphere\AppServer\java\jre\bin;C:/Program Files/Java/jdk1.8.0_171/jre/bin/server;C:/Program Files/Java/jdk1.8.0_171/jre/bin;C:/Program Files/Java/jdk1.8.0_171/jre/lib/amd64;C:\Program Files (x86)\Attachmate\;C:\PROGRA~2\CA\SC\etpki\lib;C:\Program Files (x86)\CA\SharedComponents\PEC\bin;C:\Program Files\CA\SCM\jre\bin\server;C:\Program Files\CA\SCM\jre\bin;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\ProgramData\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Users\jocastro\AppData\Roaming\nvm;C:\Program Files\nodejs;C:\Program Files\nodejs\;C:\Program Files\Java\jdk1.6.0_45\bin;C:\Program Files\apache-maven-3.5.3\bin;C:\Program Files\PuTTY\;C:\Python27;C:\Program Files\CA\Cryptography\;C:\Program Files\CA\SCM;C:\apache-ant-1.8.4;C:\Program Files\Microsoft VS Code\bin;C:\Users\jocastro\AppData\Local\Microsoft\WindowsApps;D:\Games\Git\cmd;C:\Program Files\Microsoft VS Code\bin;C:\Users\jocastro\AppData\Roaming\nvm;C:\Program Files\nodejs;C:\Users\jocastro\AppData\Roaming\npm;C:\Program Files\CA\SCM;C:\WINDOWS\System32;.;" "-Djava.endorsed.dirs=C:\Program Files (x86)\IBM\WebSphere\AppServer/endorsed_apis;C:\Program Files (x86)\IBM\WebSphere\AppServer/java/jre/lib/endorsed;C:\Program Files (x86)\IBM\WebSphere\AppServer\endorsed_apis;C:\Program Files (x86)\IBM\WebSphere\AppServer\java\jre\lib\endorsed" "-Djava.security.auth.login.config=C:\Program Files (x86)\IBM\WebSphere\AppServer\profiles\AppSrv02/properties/wsjaas.conf" "-Djava.security.policy=C:\Program Files (x86)\IBM\WebSphere\AppServer\profiles\AppSrv02/properties/server.policy" "com.ibm.wsspi.bootstrap.WSPreLauncher" "-nosplash" "-application" "com.ibm.ws.bootstrap.WSLauncher" "com.ibm.ws.runtime.WsServer" "C:\Program Files (x86)\IBM\WebSphere\AppServer\profiles\AppSrv02\config" "pb0b0826798Node02Cell" "pb0b0826798Node02" "server1"

@endlocal
