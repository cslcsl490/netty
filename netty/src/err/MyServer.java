package err;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;

import java.nio.channels.Channels;
import java.util.concurrent.Executors;

public class MyServer {
//	public static void main(String[] args) {
//		ServerBootstrap bootstrap = new ServerBootstrap(
//				new NioServerSocketChannelFactory(Executors.newCachedThreadPool(),Executors.newCachedThreadPool()));
//		bootstrap.setPipelineFactory(new ChannelPipelineFactory(){
//			public ChannelPipeline getPipeline() throws Exception{
//				return Channels.pipeline(new HelloServerHandler());
//			}
//		});
//	}
//	
//	private static class HelloServerHandler extends SimpleChannelHandler{
//		public void channelConnected(ChannelHandlerContext ctx,ChannelStateEvent e){
//			System.out.println("Hello,this is server");
//		}
//	}
}
