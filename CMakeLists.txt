project(greycat.bindins.java)

find_package(JNI QUIET)
if (JNI_FOUND)
    set(GC_BIND_JAVA true PARENT_SCOPE)
    set(JNI_SOURCES
            native/jblob.c
            native/jtensor.c
            native/jenumcall.c
            native/jduration.c
            native/jreference.c
            native/jgeocode.c
            native/jdate.c
            native/jarray.c
            native/jctx.c
            native/jfunction.c
            native/jgraph.c
            native/jobject.c
            native/jplugin.c
            native/jtype.c)

    add_library(greycat-java SHARED ${JNI_SOURCES})
    target_include_directories(greycat-java PRIVATE ${GC_CORE_INCLUDES} ${JNI_INCLUDE_DIRS})
    set_target_properties(greycat-java PROPERTIES NO_SONAME ON SUFFIX ".so")
    install(TARGETS greycat-java DESTINATION ${CMAKE_INSTALL_PREFIX}/lib)
else ()
    message(STATUS "no jni library: java binding disabled")
endif ()
