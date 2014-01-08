async-http-client-ssl-problem
=============================

Demo code to show SSL issues with async-http-client
Check it out:

    git clone https://github.com/itsadok/async-http-client-ssl-problem.git
    cd async-http-client-ssl-problem
    mvn test
    
Outputs:

    ...
    java.util.concurrent.ExecutionException: java.net.ConnectException: General SSLEngine problem to https://ws.plimus.com/
    	at com.ning.http.client.providers.netty.NettyResponseFuture.abort(NettyResponseFuture.java:328)
    	at com.ning.http.client.providers.netty.NettyConnectListener.operationComplete(NettyConnectListener.java:108)
    	at org.jboss.netty.channel.DefaultChannelFuture.notifyListener(DefaultChannelFuture.java:427)
    	at org.jboss.netty.channel.DefaultChannelFuture.notifyListeners(DefaultChannelFuture.java:413)
    	at org.jboss.netty.channel.DefaultChannelFuture.setFailure(DefaultChannelFuture.java:380)
    	at org.jboss.netty.handler.ssl.SslHandler.setHandshakeFailure(SslHandler.java:1417)
    	at org.jboss.netty.handler.ssl.SslHandler.unwrap(SslHandler.java:1293)
    	at org.jboss.netty.handler.ssl.SslHandler.decode(SslHandler.java:913)
    	at org.jboss.netty.handler.codec.frame.FrameDecoder.callDecode(FrameDecoder.java:425)
    	at org.jboss.netty.handler.codec.frame.FrameDecoder.messageReceived(FrameDecoder.java:310)
    	at org.jboss.netty.channel.SimpleChannelUpstreamHandler.handleUpstream(SimpleChannelUpstreamHandler.java:70)
    	at org.jboss.netty.channel.DefaultChannelPipeline.sendUpstream(DefaultChannelPipeline.java:564)
    	at org.jboss.netty.channel.DefaultChannelPipeline.sendUpstream(DefaultChannelPipeline.java:559)
    	at org.jboss.netty.channel.Channels.fireMessageReceived(Channels.java:268)
    	at org.jboss.netty.channel.Channels.fireMessageReceived(Channels.java:255)
    	at org.jboss.netty.channel.socket.nio.NioWorker.read(NioWorker.java:88)
    	at org.jboss.netty.channel.socket.nio.AbstractNioWorker.process(AbstractNioWorker.java:109)
    	at org.jboss.netty.channel.socket.nio.AbstractNioSelector.run(AbstractNioSelector.java:312)
    	at org.jboss.netty.channel.socket.nio.AbstractNioWorker.run(AbstractNioWorker.java:90)
    	at org.jboss.netty.channel.socket.nio.NioWorker.run(NioWorker.java:178)
    	at org.jboss.netty.util.ThreadRenamingRunnable.run(ThreadRenamingRunnable.java:108)
    	at org.jboss.netty.util.internal.DeadLockProofWorker$1.run(DeadLockProofWorker.java:42)
    	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
    	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
    	at java.lang.Thread.run(Thread.java:744)
    Caused by: java.net.ConnectException: General SSLEngine problem to https://ws.plimus.com/
    	at com.ning.http.client.providers.netty.NettyConnectListener.operationComplete(NettyConnectListener.java:104)
    	... 23 more
    Caused by: javax.net.ssl.SSLHandshakeException: General SSLEngine problem
    	at sun.security.ssl.Handshaker.checkThrown(Handshaker.java:1362)
    	at sun.security.ssl.SSLEngineImpl.checkTaskThrown(SSLEngineImpl.java:513)
    	at sun.security.ssl.SSLEngineImpl.readNetRecord(SSLEngineImpl.java:790)
    	at sun.security.ssl.SSLEngineImpl.unwrap(SSLEngineImpl.java:758)
    	at javax.net.ssl.SSLEngine.unwrap(SSLEngine.java:624)
    	at org.jboss.netty.handler.ssl.SslHandler.unwrap(SslHandler.java:1225)
    	at org.jboss.netty.handler.ssl.SslHandler.decode(SslHandler.java:913)
    	at org.jboss.netty.handler.codec.frame.FrameDecoder.callDecode(FrameDecoder.java:425)
    	at org.jboss.netty.handler.codec.frame.FrameDecoder.messageReceived(FrameDecoder.java:310)
    	at org.jboss.netty.channel.Channels.fireMessageReceived(Channels.java:268)
    	at org.jboss.netty.channel.Channels.fireMessageReceived(Channels.java:255)
    	at org.jboss.netty.channel.socket.nio.NioWorker.read(NioWorker.java:88)
    	at org.jboss.netty.channel.socket.nio.AbstractNioWorker.process(AbstractNioWorker.java:109)
    	at org.jboss.netty.channel.socket.nio.AbstractNioSelector.run(AbstractNioSelector.java:312)
    	at org.jboss.netty.channel.socket.nio.AbstractNioWorker.run(AbstractNioWorker.java:90)
    	at org.jboss.netty.channel.socket.nio.NioWorker.run(NioWorker.java:178)
    	... 3 more
    Caused by: javax.net.ssl.SSLHandshakeException: General SSLEngine problem
    	at sun.security.ssl.Alerts.getSSLException(Alerts.java:192)
    	at sun.security.ssl.SSLEngineImpl.fatal(SSLEngineImpl.java:1683)
    	at sun.security.ssl.Handshaker.fatalSE(Handshaker.java:278)
    	at sun.security.ssl.Handshaker.fatalSE(Handshaker.java:270)
    	at sun.security.ssl.ClientHandshaker.serverCertificate(ClientHandshaker.java:1341)
    	at sun.security.ssl.ClientHandshaker.processMessage(ClientHandshaker.java:153)
    	at sun.security.ssl.Handshaker.processLoop(Handshaker.java:868)
    	at sun.security.ssl.Handshaker$1.run(Handshaker.java:808)
    	at sun.security.ssl.Handshaker$1.run(Handshaker.java:806)
    	at java.security.AccessController.doPrivileged(Native Method)
    	at sun.security.ssl.Handshaker$DelegatedTask.run(Handshaker.java:1299)
    	at org.jboss.netty.handler.ssl.SslHandler$4.run(SslHandler.java:1365)
    	at org.jboss.netty.handler.ssl.ImmediateExecutor.execute(ImmediateExecutor.java:31)
    	at org.jboss.netty.handler.ssl.SslHandler.runDelegatedTasks(SslHandler.java:1362)
    	at org.jboss.netty.handler.ssl.SslHandler.unwrap(SslHandler.java:1249)
    	... 13 more
    Caused by: java.security.cert.CertificateException: Certificates does not conform to algorithm constraints
    	at sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:946)
    	at sun.security.ssl.AbstractTrustManagerWrapper.checkAdditionalTrust(SSLContextImpl.java:914)
    	at sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:828)
    	at sun.security.ssl.ClientHandshaker.serverCertificate(ClientHandshaker.java:1328)
    	... 23 more
