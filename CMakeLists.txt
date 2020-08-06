project(greycat.java)

find_package(JNI QUIET)
if (JNI_FOUND)
    set(GC_BIND_JAVA true PARENT_SCOPE)
    include_directories(${JNI_INCLUDE_DIRS})
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

#configure_file("${CMAKE_CURRENT_SOURCE_DIR}/base.pom.xml.in" "${CMAKE_CURRENT_SOURCE_DIR}/pom.xml" NEWLINE_STYLE UNIX @ONLY)
#execute_process(COMMAND cc ${CMAKE_CURRENT_SOURCE_DIR}/generator/main.c -std=c11 -o ${CMAKE_BINARY_DIR}/greycat_keys_generator_java)
#get_filename_component(GC_CORE_KEYS_PATH "${CMAKE_CURRENT_SOURCE_DIR}/../../src/greycat/common/gkeys.txt" REALPATH)
#execute_process(COMMAND
#        ${GC_DIST}/bin/greycat_keys_generator_java
#        ${GC_CORE_KEYS_PATH}
#        ${CMAKE_CURRENT_SOURCE_DIR}/src/main/java/greycat/Keys.java)


#if (JNI_FOUND)
#
#else (JNI_FOUND)
#    include_directories($ENV{JAVA_HOME}/include)
#    include_directories($ENV{JAVA_HOME}/include/darwin)
#    include_directories($ENV{JAVA_HOME}/include/linux)
#endif (JNI_FOUND)
#
#
#
#add_library(greycat.jni SHARED ${JNI_SOURCES} ${GREYCAT_EXTRA_OBJS})
#target_link_libraries(greycat.jni PUBLIC greycat)
#target_include_directories(greycat.jni PUBLIC PRIVATE ${PROJECT_SOURCE_DIR}/../../include ${PROJECT_SOURCE_DIR}/../../superblockindex/include)
#
#set_target_properties(greycat.jni PROPERTIES NO_SONAME ON SUFFIX ".so")
#
#file(MAKE_DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR}/lib/${GREYCAT_TARGET})
#add_custom_command(TARGET greycat.jni COMMAND cp ${PROJECT_BINARY_DIR}/libgreycat.jni.so ${CMAKE_CURRENT_SOURCE_DIR}/lib/${GREYCAT_TARGET}/libgreycat.jni.so)
#
#install(TARGETS greycat.jni DESTINATION ${GC_DIST_SUB}/lib)
