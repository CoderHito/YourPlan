package com.hito.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hito.domain.Constans;

@Controller
@RequestMapping("/upload")
public class FileUpload {

	private Logger logger = LoggerFactory.getLogger(FileUpload.class);

	@RequestMapping(value = "/uploadFile.do", method = RequestMethod.POST)
	@ResponseBody
	public String uploadFileHandler(@RequestParam("file") MultipartFile file) {

		String file_name = file.getOriginalFilename().trim();
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				// Creating the directory to store file
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "tmpFiles");
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + file_name);
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				logger.info("Server File Location="
						+ serverFile.getAbsolutePath());

				return Constans.SUCCESS;
			} catch (Exception e) {
				e.printStackTrace();
				return Constans.ERROR;
			}
		} else {
			return Constans.ERROR;
		}
	}
}
