package com.km7.launcher;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

import com.km7.launcher.ui.LauncherFrame;
import com.km7.launcher.util.UnzipUtility;

public class Main {
	
	public static void main(String[] args) {
		new LauncherFrame(new Color(44, 47, 51),new Color(0,174,255), new Color(255,255,255));
	}
	
	public static boolean launch() {
		
		File textures = new File(System.getProperty("user.dir") + File.separator + "shaders.zip");
		
		try {
			FileUtils.copyURLToFile(new URL("https://public.bn.files.1drv.com/y4mJzmQ47rc0CYtTE0OxgVuAcdb4DRUqMlV4mQV25_GHKc3WIVRdiSC2Ya54epDIuB9cxsy6ZYpOdt7yz_eFp6pWw_C6EPZhmvYMrg9fuIn_N7hzHvm8UNfu1gx0nfcLfMydOGdQEC76uzJrfWo9MFzinZavli1YJob35xQzV5quhTTBm5lHg1f9mGD1O21xbW55qToWntmPsEo63o2FDKjuZZUuTtEOSwBPTLwNvSVgGg?access_token=EwAIA61DBAAU2kADSankulnKv2PwDjfenppNXFIAAUW%2bl/Scg11YYloaPVtButWk7r0nNy2s2koUUTyQF4344oBmbLq5GAwxfRXd4qtWJnVwsTpONdgpq3/o7pD/qDh5JcA4XYP6Yet7vgWQug%2buFJUosMMvYc/XtcIYhtjCuIgxF8nqpve3FzvEN8OkRqk3Rtu5bPXepkSYwoLm%2bYbCz/ejOfzcIh2PuxFQfJHG7s3Py7PZ2WuOGjqz%2bie8TpyjwAVBjw1N2/hiQMHGWB9R%2bMJJpvnNkqYqzqG3T2LjxneB12tPT4t4rRvaG17aXva0WpPBlmdlhgoLYroKTCBXKiONoS0eX4EhxLzTwgwAo2RJF8madqI4hLhUIV9BR1ADZgAACF4N7LXwR8H92AFeruuUqdx5YHL9xCGgaxuvVD9csW95t2Q244gll1333pHGJrQS/r7s1uG6kGpXCI2QnpiWn%2b7%2brtetaKs9vuGgaI2AYAZAb/p2RiDQlWDKjoF9x56GZaAx6rGqFpr3BzjsJBEe3/puTWWsJWtrYBmBAB0AQRpOQ3xKBdPyezyPVNMWf2V772vLmGo9M5Bcw4iHv6jZOVeQ%2bw1MOFls3LIfXWjIuDwalL32Rprlf4Wnntu%2b40OqZb4hPAbEzhuq%2byLwKAN2O8CABSx2SPm48I4Zeb1y8Pu2cOn7pnFO/k/YX0inns4NlovsF8Bf7PuPLh7zHy9XruxKz406uvYc1NioZ4e8w6f0fJlAkZNn0ihD19U%2bVZjY0eLQ5noHu/gx3Y1XQLphrqLgpcrlv2FtyTRiK25%2bW2QCvL6iUYC3%2b5rk0uajqjzfmmUul9rvFkqS8FMP1%2bUZHB11kSGmNN%2b379UR0CobmQyBwuaT7KWVSyJnNzXXlexREqorXhExLh/mPRlfXBK2c7gGBAL7fiNTMw8fjVrN2GwG01vH%2bmnbhMl%2bkYN2YM6SDf3fTa7g89C1heVO5AcMi3mSVkt6LTiRIJcKP3r5G9UMnOi4xU56Zua3AxiLXVU8uIxEBQI%3d"), textures);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		UnzipUtility unzipper = new UnzipUtility();
		
		try {
			File Robox = new File(System.getProperty("user.home") + "/AppData/Local/Roblox/Versions/");
			for(File file :  Robox.listFiles()) {
				if(file.isDirectory()) {
					unzipper.unzip(textures.toString(), file.getPath() + "/PlatformContent");
				}
			}
			
			textures.delete();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
		
	}
	
}
