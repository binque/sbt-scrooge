Overview
========

Sbt-scrooge is an sbt plugin that adds a mixin for doing thrift code auto-generation during your
compile phase. Just mix in CompileScrooge into your project, and by default, all thrift files matching
src/thrift/*.thrift will be used to auto-generate scala sources, written to target/gen-scala.
